# Summary of the Mythical Man Month  

## Chapter 1 -The Tar Pit

Chapter 1 starts of by comparing big software companies with large beasts
stuck in a tar pit. Because few have met the goals, schedules and budgets.  

Many succesfull programs has been made by 2 men in a garage, so why isn't any
program like this.  

The book says that a program that is build like this is, is complete in itself
and works for the author on his machine.  
But it can then be build into a product, with has been through testing and have good documentation and
can be maintaned for long. But this takes 3x as long.  

You program can also move towards becoming a compenent in a programming system. 
A collection of interacting programs, coordinated in function and disciplined in format.  
This also takes 3x as long, as the program should only use as little recources (memory, time, io devices)  
And a lot of testing on many different systems.

The end of the chapter talks about how it is fun code, and create something yourself.  
But while it's fun it comes with many woes. Woes to make sure theres no bugs, and well documented, so it can be code can be used by others.

## Chaper 2  -The Mythical Man-Month

This chapter is about the tim scheduling of a project.
The man-month is a unit saying that you can replace work months with man power.  
The book says this only works when the job can be partioned among workers, with no communication among them.  
In programming this is often not the case, and it even requires a lot of communication,
and training when you hire more people, so sometimes hiring more people uses more time.
The maximum number of men depends upon the number of independent subtasks.

It also says we are very optimstic, and think we think our code will work to easy.
So we don't put enouth time into planning and testing.  
The authors thumb of rule for scheduling is:  
1/3 planning  
1/6 coding  
1/4 component test and early system test
1/4 system test, all components in hand.

