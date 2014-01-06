package com.wills.log

import com.willis.log.Source
import spock.lang.Specification

/**
 * Created by Sion on 04/01/14.
 */
class SourceSpec extends Specification {

    def "Check Source name equality"(){
        when:
        def mySource = new Source("mySourceName")

        then:
        mySource.name == "mySourceName"
    }

    def "Adding a new file to the Source files array"(){
        setup:
        def mySource = new Source("mySourceName")

        when:
        mySource.localFile("log1.log")

        then:
        mySource.files[0].isFile()
    }
}
