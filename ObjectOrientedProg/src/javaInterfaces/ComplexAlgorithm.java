package javaInterfaces;

public interface ComplexAlgorithm {
	int complexAlgorithm(int n1,int n2);
}
//establishes communication agreement between two classes (interaction).
//provides a way to continue work even when external interfaces are not available.
//can create a dummy implementation while real implementation not really available.

/*
you can have abstract classes implementing interfaces which do not have implementations for
the interface but if you have a concrete class extending that abstract class the concrete class and
the abstract class combination should provide the implementations to all the methods defined in the
interface.
*/