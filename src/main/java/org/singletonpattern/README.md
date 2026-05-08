## This Singleton implementation is not thread-safe.

## If multiple threads access getInstance() simultaneously, multiple objects may be created because both threads can pass the if(instance == null) check.

### To make it thread-safe:

### Use the synchronized keyword on the method.
### Or use eager initialization (recommended/simple approach):
### private static final SingletonClass instance =
### new SingletonClass();

### Eager initialization creates the object during class loading, making it thread-safe and avoiding synchronization overhead.

