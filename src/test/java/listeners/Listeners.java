package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.HomepageTests;

public class Listeners implements ITestListener {
    private static Logger logger = LogManager.getLogger(HomepageTests.class);
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("test started "+iTestResult.getName());
        logger.warn("Test started " + iTestResult.getName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.fatal("Test failed " + iTestResult.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        logger.error("Test skipped "+ iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
