
package mddProject.concreteSyntax;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JDSLStandaloneSetup extends JDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new JDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

