package eu.vitaliy.licencetool

class Product {
    String name
    String productVersion

    static constraints = {
        name()
        productVersion()
    }

    @Override
    public String toString() {
        "${name} ${productVersion}"
    }


}
