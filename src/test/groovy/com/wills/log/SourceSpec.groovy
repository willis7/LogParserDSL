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
}
