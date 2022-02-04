// evaluate(new File("subTesting.groovy"))
import subTesting
// def subTest

def testSubGroovyFile() {
    test = new subTesting()

    test.npmTest()
}

return this