package boletinJUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.*;
import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.CoreMatchers;
@SuppressWarnings("unused")
@Suite
@SelectClasses( { BoaTest.class, OperadorAritmeticoTest.class, PilaTest.class, SubscripcionTest.class, AccountTest.class } )
public class TestSuiteAll extends CoreMatchers{

}