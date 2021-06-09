public class ProgrammingPractices {
    Foo aFoo = ...;
    Foo.aStaticMethod(); // good
    aFoo.aStaticMethod(); // bad
    somethingThatYieldsAFoo().aStaticMethod(); // very bad

    /**
     * It is very rarely correct to do nothing in response to a caught exception.
     * Typical responses are to log it, or if it is considered "impossible, rethrow it as an AssertionError.
     * When it truly is appropriate to take no action whatsoever in a catch block, the reason this is justified is explained in a comment.
     */
    try {
        int i = Integer.parseInt(response);
        return handleNumericResponse(i);
    } catch (NumberFormatException ok) {
        // it's not numeric; that's fine, just continue
    }
    return hadnleTextResponse(response)
}
