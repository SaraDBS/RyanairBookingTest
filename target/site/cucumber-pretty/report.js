$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Booking.feature");
formatter.feature({
  "line": 1,
  "name": "Booking on Ryanair website",
  "description": "",
  "id": "booking-on-ryanair-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1921970894,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Unable to find a matching set of capabilities\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027HOME-PC\u0027, ip: \u0027192.168.95.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: \r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:209)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:132)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:120)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:98)\r\n\tat Steps.Hooks.setUp(Hooks.java:20)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:108)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:661)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:869)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1193)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:126)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:744)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:380)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:375)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:289)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1301)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1226)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1144)\r\n\tat org.testng.TestNG.run(TestNG.java:1115)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:127)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 3,
  "name": "Checkout using an invalid credit card",
  "description": "",
  "id": "booking-on-ryanair-website;checkout-using-an-invalid-credit-card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I make a booking from \"Dublin\" to \"Biarritz\" on \"15/09/2018\" for \"2\" adults and \"1\" child",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I pay for booking with card details \"5555 5555 5555 5557\", \"10/2018\" and \"265\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get payment \"declined\" message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Dublin",
      "offset": 23
    },
    {
      "val": "Biarritz",
      "offset": 35
    },
    {
      "val": "15/09/2018",
      "offset": 49
    },
    {
      "val": "2",
      "offset": 66
    },
    {
      "val": "1",
      "offset": 81
    }
  ],
  "location": "BookingSteps.iMakeABookingFromToOnForAdultsAndChild(String,String,String,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5555 5555 5555 5557",
      "offset": 37
    },
    {
      "val": "10/2018",
      "offset": 60
    },
    {
      "val": "265",
      "offset": 74
    }
  ],
  "location": "BookingSteps.iPayForBookingWithCardDetailsAnd(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "declined",
      "offset": 22
    }
  ],
  "location": "BookingSteps.iShouldGetPaymentMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 112103,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.Hooks.tearDownTest(Hooks.java:30)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:108)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:661)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:869)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1193)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:126)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:744)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:380)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:375)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:289)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1301)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1226)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1144)\r\n\tat org.testng.TestNG.run(TestNG.java:1115)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:127)\r\n",
  "status": "failed"
});
});