// evaluate(new File("subTesting.groovy"))
// import subTesting
def subTest

def testSubGroovyFile() {
    subTest = load "subTesting.groovy"
    subTest.npmTest()
    // test = new subTesting()

    // test.npmTest()
}

return this