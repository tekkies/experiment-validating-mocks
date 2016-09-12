# experiment-validating-mocks

I came across some unit tests that were testing data contracts of a class, but the higher-level integration tests were using mocs that did not abide by the same data contracts.  This made the integration tests meaningless, as they were testing states that would never exist, according to the unit tests.

Rather than trying to figure out manually which mocks were not valid, I encapsulated and exposed the unit test assertions and used them to validate the integration test mocks.

This is just a quick example to demonstrate the principle as an aid for discussion.

The code of interest is [calculateAreaOfEmptyTriangle()](https://github.com/tekkies/experiment-validating-mocks/blob/master/src/uk/co/tekkies/ExperimentValidatingMocks/tests/DrawingTest.java) - which is now intentionally failing, because the mock isn't good enough.

