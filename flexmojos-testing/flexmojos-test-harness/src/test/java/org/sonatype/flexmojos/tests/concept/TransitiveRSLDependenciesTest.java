package org.sonatype.flexmojos.tests.concept;

import org.testng.annotations.Test;

public class TransitiveRSLDependenciesTest
    extends AbstractConceptTest
{
    @Test
    public void testRSLTransitiveDependency()
        throws Exception
    {
        standardConceptTester( "transitive-rsl-dependencies" );
    }
}
