# Unhandled Exception in Groovy Closure

This example demonstrates a potential issue with exception handling when using closures in Groovy.  The exception thrown within the closure is not caught by the surrounding function, leading to unexpected program termination.  The solution provided shows a proper way to handle potential exceptions within a closure.

## How to Reproduce

1.  Save the code in `bug.groovy`.
2.  Run the script using the Groovy interpreter: `groovy bug.groovy`

The script will print "Hello" and then terminate with an unhandled `RuntimeException`.
