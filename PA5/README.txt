PA5 README

Features implemented:

15 points: Extension of your parser spec to correctly scan all tokens and parse for the PA5 grammar demonstrated with test cases
10 points: Continues to perform code generation to AVR assembly code for the PA4 AST nodes using a visitor
10 points: test cases for PA5 features
5 points: README file explaining the file structure (your test files) and other comments you want your TA to know (e.g. features not implemented)
5 points: Follows instructions for submission correctly 
15 points: Creates a symbol table that accurately represents the static scoping of the MeggyJava programs of PA5 including class scopes
15 points: Performs correct code generation to AVR assembly code for the added features in PA5 grammar:
    new class objects
    equality comparison of class refs
    this in parameters and expression (in some cases)
    assignment (in some cases)
15 points: Performs correct type checking for the PA5 grammar rules according to the MJ.jar reference compiler type errors (handles member variables, locals and assignment) (for some cases)
10 points: Check for undefined symbols.


Features not implemented (so far):

15 points: Performs correct code geneation to AVR assembly code for the added features in PA5 grammar:
    local variable uses and definitions
    class refs 
10 points: Check for doubly defined, and incorrectly typed symbols


Test Cases provided:

PA5PaddleBall.java
PA5RunningExample.java
PA5obj.java
PA5movedot.java
PA5dupParam.java
PA5dupnameserror.java


Report and Evaluation of Partner Work (joint):

- Who is going to do what?  The plan:
  We didn't make a plan.
    
- Who is going to do what?  The reality:
  Joe did the mjcup spec, test cases, README, and type checking.
  Ajith figured out how to fix the mjcup spec, symbol table, and AVR code generation.
    
- How is the testing going to be done? What actually happened: Test whatever you push to the repo,
  indicate what works and what doesn't.  This is what happened.
    
- Timeline for finishing portions of assignment: We wanted to finish the mjcup specs by 12/10, but
  we only fixed the issue with variable assignment on 12/15.  We are now attempting to do as much as
  possible before the deadline.
    
- Meeting schedule: Meet before class, use Slack to message.
