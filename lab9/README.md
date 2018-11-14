# Summary

The classes "Pessimist" and "Optimist" provides the implementation of method "update", which is the behaviour to be executed whenever the subject state changes. With lambda expressions, there is no need to create separate observer classes instance to provide the functions for these behavior implementation. Here instead of creating the observer objects and attaching them to the subject, the lambda expression representing the behavior to be executed, can be passed directly to the subject. 
So over here, lambda expressions help in reducing the code redundancy and thereby keeping the code more concise.
