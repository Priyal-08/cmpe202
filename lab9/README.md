# Summary

## Decorator Pattern

In the pattern implementation, there are different decorator classes that implements the interface.
In lambda implementation, there is no need to create separate decorator classes to decorate the concrete object. Instead, we can use lambda expresions to add additional behavior to the instance at runtime without affecting other instances of the same class.
Advantages of using lambda expressions are :

1. Code is more concise as no need to create separate decorator classes.
2. Code is more readable and easy to understand.

## Observer Pattern

In pattern implementation, the classes "Pessimist" and "Optimist" provides the implementation of method "update", which is the behaviour to be executed whenever the subject state changes. With lambda expressions, there is no need to create separate observer classes instance to provide the functions for these behavior implementation. Here instead of creating the observer objects and attaching them to the subject, the lambda expression representing the behavior to be executed, can be passed directly to the subject.

So over here, lambda expressions help in reducing the code redundancy and thereby keeping the code more concise.
