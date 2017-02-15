package org.xtext.example.student.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.student.services.StudentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStudentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Student'", "';'", "'Address'", "'{'", "'StreetAddress'", "','", "'City'", "'PostalCode'", "'}'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalStudentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStudentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStudentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStudent.g"; }


    	private StudentGrammarAccess grammarAccess;

    	public void setGrammarAccess(StudentGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalStudent.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalStudent.g:54:1: ( ruleModel EOF )
            // InternalStudent.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalStudent.g:62:1: ruleModel : ( ( rule__Model__StudentsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:66:2: ( ( ( rule__Model__StudentsAssignment )* ) )
            // InternalStudent.g:67:2: ( ( rule__Model__StudentsAssignment )* )
            {
            // InternalStudent.g:67:2: ( ( rule__Model__StudentsAssignment )* )
            // InternalStudent.g:68:3: ( rule__Model__StudentsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStudentsAssignment()); 
            // InternalStudent.g:69:3: ( rule__Model__StudentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStudent.g:69:4: rule__Model__StudentsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StudentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStudentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStudent"
    // InternalStudent.g:78:1: entryRuleStudent : ruleStudent EOF ;
    public final void entryRuleStudent() throws RecognitionException {
        try {
            // InternalStudent.g:79:1: ( ruleStudent EOF )
            // InternalStudent.g:80:1: ruleStudent EOF
            {
             before(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getStudentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalStudent.g:87:1: ruleStudent : ( ( rule__Student__Group__0 ) ) ;
    public final void ruleStudent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:91:2: ( ( ( rule__Student__Group__0 ) ) )
            // InternalStudent.g:92:2: ( ( rule__Student__Group__0 ) )
            {
            // InternalStudent.g:92:2: ( ( rule__Student__Group__0 ) )
            // InternalStudent.g:93:3: ( rule__Student__Group__0 )
            {
             before(grammarAccess.getStudentAccess().getGroup()); 
            // InternalStudent.g:94:3: ( rule__Student__Group__0 )
            // InternalStudent.g:94:4: rule__Student__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleAddress"
    // InternalStudent.g:103:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalStudent.g:104:1: ( ruleAddress EOF )
            // InternalStudent.g:105:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalStudent.g:112:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:116:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalStudent.g:117:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalStudent.g:117:2: ( ( rule__Address__Group__0 ) )
            // InternalStudent.g:118:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalStudent.g:119:3: ( rule__Address__Group__0 )
            // InternalStudent.g:119:4: rule__Address__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "rule__Student__Group__0"
    // InternalStudent.g:127:1: rule__Student__Group__0 : rule__Student__Group__0__Impl rule__Student__Group__1 ;
    public final void rule__Student__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:131:1: ( rule__Student__Group__0__Impl rule__Student__Group__1 )
            // InternalStudent.g:132:2: rule__Student__Group__0__Impl rule__Student__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Student__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0"


    // $ANTLR start "rule__Student__Group__0__Impl"
    // InternalStudent.g:139:1: rule__Student__Group__0__Impl : ( 'Student' ) ;
    public final void rule__Student__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:143:1: ( ( 'Student' ) )
            // InternalStudent.g:144:1: ( 'Student' )
            {
            // InternalStudent.g:144:1: ( 'Student' )
            // InternalStudent.g:145:2: 'Student'
            {
             before(grammarAccess.getStudentAccess().getStudentKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getStudentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__0__Impl"


    // $ANTLR start "rule__Student__Group__1"
    // InternalStudent.g:154:1: rule__Student__Group__1 : rule__Student__Group__1__Impl rule__Student__Group__2 ;
    public final void rule__Student__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:158:1: ( rule__Student__Group__1__Impl rule__Student__Group__2 )
            // InternalStudent.g:159:2: rule__Student__Group__1__Impl rule__Student__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Student__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1"


    // $ANTLR start "rule__Student__Group__1__Impl"
    // InternalStudent.g:166:1: rule__Student__Group__1__Impl : ( ( rule__Student__IdAssignment_1 ) ) ;
    public final void rule__Student__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:170:1: ( ( ( rule__Student__IdAssignment_1 ) ) )
            // InternalStudent.g:171:1: ( ( rule__Student__IdAssignment_1 ) )
            {
            // InternalStudent.g:171:1: ( ( rule__Student__IdAssignment_1 ) )
            // InternalStudent.g:172:2: ( rule__Student__IdAssignment_1 )
            {
             before(grammarAccess.getStudentAccess().getIdAssignment_1()); 
            // InternalStudent.g:173:2: ( rule__Student__IdAssignment_1 )
            // InternalStudent.g:173:3: rule__Student__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Student__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__1__Impl"


    // $ANTLR start "rule__Student__Group__2"
    // InternalStudent.g:181:1: rule__Student__Group__2 : rule__Student__Group__2__Impl rule__Student__Group__3 ;
    public final void rule__Student__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:185:1: ( rule__Student__Group__2__Impl rule__Student__Group__3 )
            // InternalStudent.g:186:2: rule__Student__Group__2__Impl rule__Student__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Student__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2"


    // $ANTLR start "rule__Student__Group__2__Impl"
    // InternalStudent.g:193:1: rule__Student__Group__2__Impl : ( ( rule__Student__NameAssignment_2 ) ) ;
    public final void rule__Student__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:197:1: ( ( ( rule__Student__NameAssignment_2 ) ) )
            // InternalStudent.g:198:1: ( ( rule__Student__NameAssignment_2 ) )
            {
            // InternalStudent.g:198:1: ( ( rule__Student__NameAssignment_2 ) )
            // InternalStudent.g:199:2: ( rule__Student__NameAssignment_2 )
            {
             before(grammarAccess.getStudentAccess().getNameAssignment_2()); 
            // InternalStudent.g:200:2: ( rule__Student__NameAssignment_2 )
            // InternalStudent.g:200:3: rule__Student__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Student__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__2__Impl"


    // $ANTLR start "rule__Student__Group__3"
    // InternalStudent.g:208:1: rule__Student__Group__3 : rule__Student__Group__3__Impl rule__Student__Group__4 ;
    public final void rule__Student__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:212:1: ( rule__Student__Group__3__Impl rule__Student__Group__4 )
            // InternalStudent.g:213:2: rule__Student__Group__3__Impl rule__Student__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Student__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3"


    // $ANTLR start "rule__Student__Group__3__Impl"
    // InternalStudent.g:220:1: rule__Student__Group__3__Impl : ( ( rule__Student__AgeAssignment_3 ) ) ;
    public final void rule__Student__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:224:1: ( ( ( rule__Student__AgeAssignment_3 ) ) )
            // InternalStudent.g:225:1: ( ( rule__Student__AgeAssignment_3 ) )
            {
            // InternalStudent.g:225:1: ( ( rule__Student__AgeAssignment_3 ) )
            // InternalStudent.g:226:2: ( rule__Student__AgeAssignment_3 )
            {
             before(grammarAccess.getStudentAccess().getAgeAssignment_3()); 
            // InternalStudent.g:227:2: ( rule__Student__AgeAssignment_3 )
            // InternalStudent.g:227:3: rule__Student__AgeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Student__AgeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getAgeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__3__Impl"


    // $ANTLR start "rule__Student__Group__4"
    // InternalStudent.g:235:1: rule__Student__Group__4 : rule__Student__Group__4__Impl rule__Student__Group__5 ;
    public final void rule__Student__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:239:1: ( rule__Student__Group__4__Impl rule__Student__Group__5 )
            // InternalStudent.g:240:2: rule__Student__Group__4__Impl rule__Student__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Student__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Student__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4"


    // $ANTLR start "rule__Student__Group__4__Impl"
    // InternalStudent.g:247:1: rule__Student__Group__4__Impl : ( ( rule__Student__AddressAssignment_4 ) ) ;
    public final void rule__Student__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:251:1: ( ( ( rule__Student__AddressAssignment_4 ) ) )
            // InternalStudent.g:252:1: ( ( rule__Student__AddressAssignment_4 ) )
            {
            // InternalStudent.g:252:1: ( ( rule__Student__AddressAssignment_4 ) )
            // InternalStudent.g:253:2: ( rule__Student__AddressAssignment_4 )
            {
             before(grammarAccess.getStudentAccess().getAddressAssignment_4()); 
            // InternalStudent.g:254:2: ( rule__Student__AddressAssignment_4 )
            // InternalStudent.g:254:3: rule__Student__AddressAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Student__AddressAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStudentAccess().getAddressAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__4__Impl"


    // $ANTLR start "rule__Student__Group__5"
    // InternalStudent.g:262:1: rule__Student__Group__5 : rule__Student__Group__5__Impl ;
    public final void rule__Student__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:266:1: ( rule__Student__Group__5__Impl )
            // InternalStudent.g:267:2: rule__Student__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Student__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5"


    // $ANTLR start "rule__Student__Group__5__Impl"
    // InternalStudent.g:273:1: rule__Student__Group__5__Impl : ( ';' ) ;
    public final void rule__Student__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:277:1: ( ( ';' ) )
            // InternalStudent.g:278:1: ( ';' )
            {
            // InternalStudent.g:278:1: ( ';' )
            // InternalStudent.g:279:2: ';'
            {
             before(grammarAccess.getStudentAccess().getSemicolonKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__Group__5__Impl"


    // $ANTLR start "rule__Address__Group__0"
    // InternalStudent.g:289:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:293:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalStudent.g:294:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Address__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0"


    // $ANTLR start "rule__Address__Group__0__Impl"
    // InternalStudent.g:301:1: rule__Address__Group__0__Impl : ( 'Address' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:305:1: ( ( 'Address' ) )
            // InternalStudent.g:306:1: ( 'Address' )
            {
            // InternalStudent.g:306:1: ( 'Address' )
            // InternalStudent.g:307:2: 'Address'
            {
             before(grammarAccess.getAddressAccess().getAddressKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0__Impl"


    // $ANTLR start "rule__Address__Group__1"
    // InternalStudent.g:316:1: rule__Address__Group__1 : rule__Address__Group__1__Impl rule__Address__Group__2 ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:320:1: ( rule__Address__Group__1__Impl rule__Address__Group__2 )
            // InternalStudent.g:321:2: rule__Address__Group__1__Impl rule__Address__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Address__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1"


    // $ANTLR start "rule__Address__Group__1__Impl"
    // InternalStudent.g:328:1: rule__Address__Group__1__Impl : ( '{' ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:332:1: ( ( '{' ) )
            // InternalStudent.g:333:1: ( '{' )
            {
            // InternalStudent.g:333:1: ( '{' )
            // InternalStudent.g:334:2: '{'
            {
             before(grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1__Impl"


    // $ANTLR start "rule__Address__Group__2"
    // InternalStudent.g:343:1: rule__Address__Group__2 : rule__Address__Group__2__Impl rule__Address__Group__3 ;
    public final void rule__Address__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:347:1: ( rule__Address__Group__2__Impl rule__Address__Group__3 )
            // InternalStudent.g:348:2: rule__Address__Group__2__Impl rule__Address__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Address__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__2"


    // $ANTLR start "rule__Address__Group__2__Impl"
    // InternalStudent.g:355:1: rule__Address__Group__2__Impl : ( 'StreetAddress' ) ;
    public final void rule__Address__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:359:1: ( ( 'StreetAddress' ) )
            // InternalStudent.g:360:1: ( 'StreetAddress' )
            {
            // InternalStudent.g:360:1: ( 'StreetAddress' )
            // InternalStudent.g:361:2: 'StreetAddress'
            {
             before(grammarAccess.getAddressAccess().getStreetAddressKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetAddressKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__2__Impl"


    // $ANTLR start "rule__Address__Group__3"
    // InternalStudent.g:370:1: rule__Address__Group__3 : rule__Address__Group__3__Impl rule__Address__Group__4 ;
    public final void rule__Address__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:374:1: ( rule__Address__Group__3__Impl rule__Address__Group__4 )
            // InternalStudent.g:375:2: rule__Address__Group__3__Impl rule__Address__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Address__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__3"


    // $ANTLR start "rule__Address__Group__3__Impl"
    // InternalStudent.g:382:1: rule__Address__Group__3__Impl : ( ( rule__Address__StreetAddressAssignment_3 ) ) ;
    public final void rule__Address__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:386:1: ( ( ( rule__Address__StreetAddressAssignment_3 ) ) )
            // InternalStudent.g:387:1: ( ( rule__Address__StreetAddressAssignment_3 ) )
            {
            // InternalStudent.g:387:1: ( ( rule__Address__StreetAddressAssignment_3 ) )
            // InternalStudent.g:388:2: ( rule__Address__StreetAddressAssignment_3 )
            {
             before(grammarAccess.getAddressAccess().getStreetAddressAssignment_3()); 
            // InternalStudent.g:389:2: ( rule__Address__StreetAddressAssignment_3 )
            // InternalStudent.g:389:3: rule__Address__StreetAddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Address__StreetAddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getStreetAddressAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__3__Impl"


    // $ANTLR start "rule__Address__Group__4"
    // InternalStudent.g:397:1: rule__Address__Group__4 : rule__Address__Group__4__Impl rule__Address__Group__5 ;
    public final void rule__Address__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:401:1: ( rule__Address__Group__4__Impl rule__Address__Group__5 )
            // InternalStudent.g:402:2: rule__Address__Group__4__Impl rule__Address__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Address__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__4"


    // $ANTLR start "rule__Address__Group__4__Impl"
    // InternalStudent.g:409:1: rule__Address__Group__4__Impl : ( ',' ) ;
    public final void rule__Address__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:413:1: ( ( ',' ) )
            // InternalStudent.g:414:1: ( ',' )
            {
            // InternalStudent.g:414:1: ( ',' )
            // InternalStudent.g:415:2: ','
            {
             before(grammarAccess.getAddressAccess().getCommaKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__4__Impl"


    // $ANTLR start "rule__Address__Group__5"
    // InternalStudent.g:424:1: rule__Address__Group__5 : rule__Address__Group__5__Impl rule__Address__Group__6 ;
    public final void rule__Address__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:428:1: ( rule__Address__Group__5__Impl rule__Address__Group__6 )
            // InternalStudent.g:429:2: rule__Address__Group__5__Impl rule__Address__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Address__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__5"


    // $ANTLR start "rule__Address__Group__5__Impl"
    // InternalStudent.g:436:1: rule__Address__Group__5__Impl : ( 'City' ) ;
    public final void rule__Address__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:440:1: ( ( 'City' ) )
            // InternalStudent.g:441:1: ( 'City' )
            {
            // InternalStudent.g:441:1: ( 'City' )
            // InternalStudent.g:442:2: 'City'
            {
             before(grammarAccess.getAddressAccess().getCityKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCityKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__5__Impl"


    // $ANTLR start "rule__Address__Group__6"
    // InternalStudent.g:451:1: rule__Address__Group__6 : rule__Address__Group__6__Impl rule__Address__Group__7 ;
    public final void rule__Address__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:455:1: ( rule__Address__Group__6__Impl rule__Address__Group__7 )
            // InternalStudent.g:456:2: rule__Address__Group__6__Impl rule__Address__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Address__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__6"


    // $ANTLR start "rule__Address__Group__6__Impl"
    // InternalStudent.g:463:1: rule__Address__Group__6__Impl : ( ( rule__Address__CityAssignment_6 ) ) ;
    public final void rule__Address__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:467:1: ( ( ( rule__Address__CityAssignment_6 ) ) )
            // InternalStudent.g:468:1: ( ( rule__Address__CityAssignment_6 ) )
            {
            // InternalStudent.g:468:1: ( ( rule__Address__CityAssignment_6 ) )
            // InternalStudent.g:469:2: ( rule__Address__CityAssignment_6 )
            {
             before(grammarAccess.getAddressAccess().getCityAssignment_6()); 
            // InternalStudent.g:470:2: ( rule__Address__CityAssignment_6 )
            // InternalStudent.g:470:3: rule__Address__CityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Address__CityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getCityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__6__Impl"


    // $ANTLR start "rule__Address__Group__7"
    // InternalStudent.g:478:1: rule__Address__Group__7 : rule__Address__Group__7__Impl rule__Address__Group__8 ;
    public final void rule__Address__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:482:1: ( rule__Address__Group__7__Impl rule__Address__Group__8 )
            // InternalStudent.g:483:2: rule__Address__Group__7__Impl rule__Address__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Address__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__7"


    // $ANTLR start "rule__Address__Group__7__Impl"
    // InternalStudent.g:490:1: rule__Address__Group__7__Impl : ( ',' ) ;
    public final void rule__Address__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:494:1: ( ( ',' ) )
            // InternalStudent.g:495:1: ( ',' )
            {
            // InternalStudent.g:495:1: ( ',' )
            // InternalStudent.g:496:2: ','
            {
             before(grammarAccess.getAddressAccess().getCommaKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__7__Impl"


    // $ANTLR start "rule__Address__Group__8"
    // InternalStudent.g:505:1: rule__Address__Group__8 : rule__Address__Group__8__Impl rule__Address__Group__9 ;
    public final void rule__Address__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:509:1: ( rule__Address__Group__8__Impl rule__Address__Group__9 )
            // InternalStudent.g:510:2: rule__Address__Group__8__Impl rule__Address__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Address__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__8"


    // $ANTLR start "rule__Address__Group__8__Impl"
    // InternalStudent.g:517:1: rule__Address__Group__8__Impl : ( 'PostalCode' ) ;
    public final void rule__Address__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:521:1: ( ( 'PostalCode' ) )
            // InternalStudent.g:522:1: ( 'PostalCode' )
            {
            // InternalStudent.g:522:1: ( 'PostalCode' )
            // InternalStudent.g:523:2: 'PostalCode'
            {
             before(grammarAccess.getAddressAccess().getPostalCodeKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getPostalCodeKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__8__Impl"


    // $ANTLR start "rule__Address__Group__9"
    // InternalStudent.g:532:1: rule__Address__Group__9 : rule__Address__Group__9__Impl rule__Address__Group__10 ;
    public final void rule__Address__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:536:1: ( rule__Address__Group__9__Impl rule__Address__Group__10 )
            // InternalStudent.g:537:2: rule__Address__Group__9__Impl rule__Address__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Address__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__9"


    // $ANTLR start "rule__Address__Group__9__Impl"
    // InternalStudent.g:544:1: rule__Address__Group__9__Impl : ( ( rule__Address__PostalCodeAssignment_9 ) ) ;
    public final void rule__Address__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:548:1: ( ( ( rule__Address__PostalCodeAssignment_9 ) ) )
            // InternalStudent.g:549:1: ( ( rule__Address__PostalCodeAssignment_9 ) )
            {
            // InternalStudent.g:549:1: ( ( rule__Address__PostalCodeAssignment_9 ) )
            // InternalStudent.g:550:2: ( rule__Address__PostalCodeAssignment_9 )
            {
             before(grammarAccess.getAddressAccess().getPostalCodeAssignment_9()); 
            // InternalStudent.g:551:2: ( rule__Address__PostalCodeAssignment_9 )
            // InternalStudent.g:551:3: rule__Address__PostalCodeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Address__PostalCodeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getPostalCodeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__9__Impl"


    // $ANTLR start "rule__Address__Group__10"
    // InternalStudent.g:559:1: rule__Address__Group__10 : rule__Address__Group__10__Impl ;
    public final void rule__Address__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:563:1: ( rule__Address__Group__10__Impl )
            // InternalStudent.g:564:2: rule__Address__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__10"


    // $ANTLR start "rule__Address__Group__10__Impl"
    // InternalStudent.g:570:1: rule__Address__Group__10__Impl : ( '}' ) ;
    public final void rule__Address__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:574:1: ( ( '}' ) )
            // InternalStudent.g:575:1: ( '}' )
            {
            // InternalStudent.g:575:1: ( '}' )
            // InternalStudent.g:576:2: '}'
            {
             before(grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__10__Impl"


    // $ANTLR start "rule__Model__StudentsAssignment"
    // InternalStudent.g:586:1: rule__Model__StudentsAssignment : ( ruleStudent ) ;
    public final void rule__Model__StudentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:590:1: ( ( ruleStudent ) )
            // InternalStudent.g:591:2: ( ruleStudent )
            {
            // InternalStudent.g:591:2: ( ruleStudent )
            // InternalStudent.g:592:3: ruleStudent
            {
             before(grammarAccess.getModelAccess().getStudentsStudentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStudent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStudentsStudentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StudentsAssignment"


    // $ANTLR start "rule__Student__IdAssignment_1"
    // InternalStudent.g:601:1: rule__Student__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Student__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:605:1: ( ( RULE_ID ) )
            // InternalStudent.g:606:2: ( RULE_ID )
            {
            // InternalStudent.g:606:2: ( RULE_ID )
            // InternalStudent.g:607:3: RULE_ID
            {
             before(grammarAccess.getStudentAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__IdAssignment_1"


    // $ANTLR start "rule__Student__NameAssignment_2"
    // InternalStudent.g:616:1: rule__Student__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Student__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:620:1: ( ( RULE_STRING ) )
            // InternalStudent.g:621:2: ( RULE_STRING )
            {
            // InternalStudent.g:621:2: ( RULE_STRING )
            // InternalStudent.g:622:3: RULE_STRING
            {
             before(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__NameAssignment_2"


    // $ANTLR start "rule__Student__AgeAssignment_3"
    // InternalStudent.g:631:1: rule__Student__AgeAssignment_3 : ( RULE_INT ) ;
    public final void rule__Student__AgeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:635:1: ( ( RULE_INT ) )
            // InternalStudent.g:636:2: ( RULE_INT )
            {
            // InternalStudent.g:636:2: ( RULE_INT )
            // InternalStudent.g:637:3: RULE_INT
            {
             before(grammarAccess.getStudentAccess().getAgeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStudentAccess().getAgeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__AgeAssignment_3"


    // $ANTLR start "rule__Student__AddressAssignment_4"
    // InternalStudent.g:646:1: rule__Student__AddressAssignment_4 : ( ruleAddress ) ;
    public final void rule__Student__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:650:1: ( ( ruleAddress ) )
            // InternalStudent.g:651:2: ( ruleAddress )
            {
            // InternalStudent.g:651:2: ( ruleAddress )
            // InternalStudent.g:652:3: ruleAddress
            {
             before(grammarAccess.getStudentAccess().getAddressAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getStudentAccess().getAddressAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Student__AddressAssignment_4"


    // $ANTLR start "rule__Address__StreetAddressAssignment_3"
    // InternalStudent.g:661:1: rule__Address__StreetAddressAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Address__StreetAddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:665:1: ( ( RULE_STRING ) )
            // InternalStudent.g:666:2: ( RULE_STRING )
            {
            // InternalStudent.g:666:2: ( RULE_STRING )
            // InternalStudent.g:667:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getStreetAddressSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetAddressSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__StreetAddressAssignment_3"


    // $ANTLR start "rule__Address__CityAssignment_6"
    // InternalStudent.g:676:1: rule__Address__CityAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Address__CityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:680:1: ( ( RULE_STRING ) )
            // InternalStudent.g:681:2: ( RULE_STRING )
            {
            // InternalStudent.g:681:2: ( RULE_STRING )
            // InternalStudent.g:682:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__CityAssignment_6"


    // $ANTLR start "rule__Address__PostalCodeAssignment_9"
    // InternalStudent.g:691:1: rule__Address__PostalCodeAssignment_9 : ( RULE_INT ) ;
    public final void rule__Address__PostalCodeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStudent.g:695:1: ( ( RULE_INT ) )
            // InternalStudent.g:696:2: ( RULE_INT )
            {
            // InternalStudent.g:696:2: ( RULE_INT )
            // InternalStudent.g:697:3: RULE_INT
            {
             before(grammarAccess.getAddressAccess().getPostalCodeINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getPostalCodeINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__PostalCodeAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});

}