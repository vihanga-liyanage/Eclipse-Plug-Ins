/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.student.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.student.StudentRuntimeModule
import org.xtext.example.student.StudentStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class StudentIdeSetup extends StudentStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new StudentRuntimeModule, new StudentIdeModule))
	}
	
}
