package com.blog.app;

import com.blog.app.jwt.JwtUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    private final JwtUtils jwtUtils = new JwtUtils();

    
    public void testGenerateAndValidateToken() {
        String token = jwtUtils.generateJwtTokenWithUsername("user");
        assertTrue(jwtUtils.validateJwtToken(token));
        assertEquals("user", jwtUtils.getUsernameFromJwtToken(token));
    }
}
