# Out of the Tar Pit Summary

For which makes building software hard, complexity is the only significant one.  
Complexity is the root for a majority of problems.  
The paper is about complexity that makes large systems hard to understand. And it looks 
at common causes of complexity.  

## Approaches to Understanding

Testing:  
Understanding a system from the outside as a black box. Done by human or machine.  

Informal Reasoning:  
Understanding a system by examining it from the inside. Hoping to get a more accurate understanding
by using the extra information.  

Of these 2 informal reasoning is by far the most important one.  

undersatanding a system has limitations, therefore it may be prudent to deploy testing and informal
reasoning together. And this is also why simplicity is vital.
Next to testing and reasoning, simplicity is most important.  

## Causes of Complexity
1. Complexity caused by State  
    The presence of state makes programs hard to understand.
2. Complexity caused by Control  
    Is about the order in which things happen. 
3. Compexity caused by Code Volume
    Most systems complexity definaitely does exhibit nonlinear increase with size.  
    So it is vital to reduce code size  
4. Other Causes of Complexity
    -Duplicated code, dead code, unnecessary abstraction, poor documentation...  
    All comes down to 3 principles:  
    Complexity breeds complexity  
    Simplicity is hard  
    Power caorrupts:
     Given a powerful language that gives the developer alot of power, the harder it
     is to systems constructed in it. Like manunal memory management.

## Classical approahes to managing complexexity
It goes through how different kind of programming languages (imperatice, functional, logic) 
manages complexity.

### Object-Orientation
State in OOP: OOP rely on states contained in objects. And therefor 
OOP suffers from State complexity.

Control in OOP: offer standard sequential control flow, and often "shared-state concurrency"
which comes with manu complexity problems.

All in all imperative and OOP suffers from state and control complexity.

### Functional 
Functional programming either shun state and side effects, or sometimes allow it,
but advocates against it.  By avoiding state we also avoid the state-related weaknesses. 
And informal reasoning becomes more effective.

Most languages follow left-to-right sequencing, so many of the same problems appaear.
But functional programming has benefit to control. Because they use abstract functionals instead
of explicit looping. (fold, map).  
And in concurrent versions of functional languages, it will always be safe to avaluate 
arguments in parallel.

### Logic Programming
State: Profits from the same advantages as functional programming
by removing mutable states. However many languages provides some stateful mechanisms aswell.

Control: Logic programming offers the tantalising promise to escape from the complexity proplems
caused by control.


## Accidents and Essence
**Essential Complexity** inherent in the nature of software. 
Strictly essential to the users problem    
**Accidental Complexity** is the rest, complexity arising from perfomance 
issues and suboptimal language and infrastructure

The paper dissagrees that complexity is of the essential type.
And Complexity is not inherent. When it comes to accidental complexity the goal is 
for software engineering to eliminate as much of it as possible.



