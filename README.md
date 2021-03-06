# Experiment: Mock by contract

**TL;DR:** If your unit tests validate an object, when you mock the object elsewhere, use the validation to check the mock.

The code of interest is [testCalculateAreaOfDrawingShapes()](https://github.com/tekkies/experiment-validating-mocks/blob/master/src/uk/co/tekkies/ExperimentValidatingMocks/tests/DrawingTest.java) - which is now intentionally failing, because the mock doesn't behave as any real object would.

I came across this when some unit tests were testing data contracts of a class, but the higher-level integration tests were using mocks that did not abide by the same data contracts. This made the integration tests meaningless, as they were testing states that would never exist, according to the unit tests.

Rather than trying to figure out manually which mocks were not valid, I encapsulated and exposed the unit test assertions and used them to validate the integration test mocks.

The code here is the essence of what I ended up with, in simplified form. 
