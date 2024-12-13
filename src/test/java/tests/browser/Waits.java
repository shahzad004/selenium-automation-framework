package tests.browser;

public class Waits {

    /*
    * Fluent Wait

    Description: Fluent wait is similar to explicit wait but with more control. You can define a polling interval
    * (how frequently it checks for a condition) and specify exceptions to ignore.
    * Fluent wait is more advanced and useful for highly dynamic pages.
    Usage: Ideal for situations where elements appear or disappear unexpectedly,
    * or when you need to wait for a specific condition at intervals.
    Recommended for: Situations requiring fine-grained control over
    * timing and handling unexpected conditions.
    Avoid if: Your tests don’t need frequent polling or are simple enough for explicit wait.

    Wait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofSeconds(2))
        .ignoring(NoSuchElementException.class);

    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));


    Recommendations

        Use Explicit Wait for most cases, as it provides specific control over conditions and reduces unnecessary waiting time.
        Avoid Overusing Implicit Wait as it may interfere with other wait conditions and lead to unpredictable delays.
        Use Fluent Wait sparingly, mainly when you need advanced control with polling for highly dynamic pages.

    In Summary:

    Primary Choice: Explicit Wait.
    Secondary Choice: Fluent Wait (when advanced control is needed).
    Use Caution: Implicit Wait (try to keep it minimal or avoid it if using explicit waits extensively).
    *
    * */

}
