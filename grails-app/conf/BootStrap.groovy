import eu.vitaliy.licencetool.EventType
import eu.vitaliy.licencetool.InitDataLoader

class BootStrap {

    def init = { servletContext ->
        def initDataLoader = new InitDataLoader()
        initDataLoader.loadData()
    }

    def destroy = {
    }
}
