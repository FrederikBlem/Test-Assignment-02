# Test-Assignment-02

[Assignment PDF](https://github.com/FrederikBlem/Test-Assignment-02/blob/main/assignment-02.pdf)

## 1 Reflections

### 1.1 Computer Mouse
Identify the types of testing you would perform on a computer mouse, to make sure 
that it is of the highest quality.

Identify factors/criteria used to determine "highest quality" and test them. For example:
* __Hand support.__ <br>__End user tests__ at different lengths of time.
* __Part longevity.__ <br>The equivalent of __unit tests__.
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
Bowling Game Kata Slides: <a href="http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt">link</a>
- Couldn't open in browser or read when downloaded at 10:45 29-09-2021 CEST.

## 3 Investigation of Tools

### 3.1 JUnit5
* @Tag 
* @Disabled 
* @RepeatedTest 
* @BeforeEach, @AfterEach 
* @BeforeAll, @AfterAll 
* @DisplayName 
* @Nested 
* assumeFalse, assumeTrue

### 3.2 Mocking Frameworks
Investigate mocking frameworks for your preferred language. Choose at least two 
frameworks, and answer the questions. (One could be Mockito, which we saw in class.)

#### Mocking Framework 1

#### Mocking Framework 2
