/**
 * generated by Xtext 2.11.0
 */
package org.wso2.vihanga.example.student;

import org.wso2.vihanga.example.student.StudentStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class StudentStandaloneSetup extends StudentStandaloneSetupGenerated {
  public static void doSetup() {
    new StudentStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
