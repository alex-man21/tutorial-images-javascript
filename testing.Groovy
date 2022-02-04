// evaluate(new File("subTesting.groovy"))
import subTesting

def testSubGroovyFile() {
    def subTest = new subTesting()

    subTest.npmTest()
}

return this