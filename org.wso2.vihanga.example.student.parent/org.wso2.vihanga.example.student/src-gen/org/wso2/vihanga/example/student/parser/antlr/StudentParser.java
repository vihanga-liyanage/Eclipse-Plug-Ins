/*
 * generated by Xtext 2.11.0
 */
package org.wso2.vihanga.example.student.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.wso2.vihanga.example.student.parser.antlr.internal.InternalStudentParser;
import org.wso2.vihanga.example.student.services.StudentGrammarAccess;

public class StudentParser extends AbstractAntlrParser {

	@Inject
	private StudentGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStudentParser createParser(XtextTokenStream stream) {
		return new InternalStudentParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public StudentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StudentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}