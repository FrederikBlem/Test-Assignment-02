# Test-Assignment-02

[Assignment PDF](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/assignment-02.pdf)

## 1 Reflections

### 1.1 Computer Mouse
Identify the types of testing you would perform on a computer mouse, to make sure 
that it is of the highest quality.

Identify factors/criteria used to determine "highest quality" and test them. For example:
* __Hand support.__ <br>__End user tests__ at different lengths of time.
* __Part longevity/durability.__ <br>The equivalent of __unit tests and stress tests__.
* __Response time.__ <br>__Both unit test equivalents and integration tests__.
* __Number of buttons__ (and programmability?). <br>__Both unit test equivalents and integration tests__.
* __Customizability.__ <br>__Both unit test equivalents and integration tests__ (because a customizable width or LED lights sometimes need to work with software for example.)

### 1.2 Catastrophic Failure
Find a story where a software system defect had a bad outcome. Describe what 
happened. Can you identify a test that would have prevented it?

[Ariane-5.](https://youtu.be/AGI371ht1N8?t=622)
<br>A memory allocation failure caused a rocket to explode. [Another short article on it.](https://www-users.cse.umn.edu/~arnold/disasters/ariane.html)
<br>A simulated integration test or possibly a simulated system test could have caught this error before launch.
<br>The simulated integration test would relay the true capability of this faster version of the rocket and cause the failure in the testing stage rather than at launch.

## 2 Two Katas

### 2.1 String Utility
[StringUtility tests.](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/TestAssignment02/src/test/java/UtilityForStrings/StringUtilityTest.java)<br>
[StringUtility class.](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/TestAssignment02/src/main/java/UtilityForStrings/StringUtility.java)

### 2.2 Bowling Game Kata
Bowling Game Kata Slides: <a href="http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt">link</a> or [here](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/Bowling%20Game%20Kata.ppt).<br>
[BowlingGameKata Tests.](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/TestAssignment02/src/test/java/BowlingGameKata/BowlingGameTest.java)<br>
[BowlingGameKata Game class.](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/TestAssignment02/src/main/java/BowlingGameKata/Game.java)

## 3 Investigation of Tools

### 3.1 JUnit5
* __@Tag__
<br>Tagging lets the developer/tester filter tests with a distinct name. This makes it possible to sort by type of test.
* __@Disabled__ 
<br>Disabled lets the developer/tester disable a test without deleting it. This is useful when the test might become relevant again in the future.
* __@RepeatedTest__
<br>Lets the developer/tester run a test multiple times.
* __@BeforeEach, @AfterEach__ 
<br>These two are used to setup some preparatory work required for each test individually and then performing something after each test. For example creating an object to test on or using global variables, that must be cleaned up again for use by the next test.
* __@BeforeAll, @AfterAll__
<br>Much like the above two, these differ by preparing the setup once and performing the final work once.
* __@DisplayName__ 
<br>This allows the developer/tester to give each test a custom name.
* __@Nested__ 
<br>This allows the developer/tester to group a number of tests under a parent. Basically another way of sorting related tests together.
* __assumeFalse, assumeTrue__
<br>These are ways to state that something is assumed to be either false or true.

### 3.2 Mocking Frameworks
Investigate mocking frameworks for your preferred language. Choose at least two 
frameworks, and answer the questions. (One could be Mockito, which we saw in class.)

I chose __Mockito__ and __EasyMock__.

#### What are their similarities?
They are both annotation based. Their purpose is to help the developer/test mock parts of software to test in isolation.

#### What are their differences?
Refer to [this article's table](https://www.javatpoint.com/mockito-vs-easymock).
The main differences to me is how Mockito supports spies and how they are different from full mocks as well as outlining how the method verifying mock calls is always called after a so-called "replay(mock)" method.

#### Which one would you prefer, if any, and why?
Since they seem fairly similar, but Mockito seems capable of more, I would choose that.
