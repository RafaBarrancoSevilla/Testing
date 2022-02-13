package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.hamcrest.*;
import static org.hamcrest.Matchers.*;

class BoaTest extends CoreMatchers{

	private Boa boa;
	private boolean sano;
	private int cueva;

	static Stream<Arguments> datos() {
		return Stream.of(
				
				Arguments.of("Cobra", 12, "Aves",false,11), 
				Arguments.of("Culebra", 2, "Renacuajos", false, 3),
				Arguments.of("Anaconda", 14, "Humanos",false, 9), 
				Arguments.of("Víbora", 15, "granola bars", true, 3)
		);
	}

	
	@ParameterizedTest
	@MethodSource("datos")
	void testBoa(String nombre, int tamanio, String comida) {
		
		boa= new Boa(nombre, tamanio, comida);
		
		assertThat("Error", boa, notNullValue());
	}

	@ParameterizedTest
	@MethodSource("datos")
	void testIsHealthy(String nombre, int tamanio, String comida, boolean sano) {
		
		boa= new Boa(nombre, tamanio, comida);
		
		assertThat("Error",boa.isHealthy(), equalTo(sano));
	}

	@ParameterizedTest
	@MethodSource("datos")
	void testFitsInCage(String nombre, int tamanio, String comida, boolean sano, int cueva) {
		
		boa= new Boa(nombre, tamanio, comida);
		boolean PuedeEntrar;
		if(tamanio<cueva) {
			PuedeEntrar=true;
		}else {
			PuedeEntrar=false;
		}
		
		assertThat("Error", boa.fitsInCage(cueva), equalTo(PuedeEntrar));
	}

}