package com.willis.log

import com.willis.log.Report
import spock.lang.Specification

/**
 * Created by Sion on 05/01/14.
 */
class ReportSpec  extends Specification {

    def "Check Report name equality"(){
        when:
        def myReport = new Report("myReportName")

        then:
        myReport.name == "myReportName"
        myReport.name.length() == 12
    }

    def "Adding a column to sumColumns array"(){
        setup:
        def myReport = new Report("myReportName")

        when:
        myReport.sum("columnOne")
        myReport.sum("columnTwo")

        then:
        myReport.sumColumns.size() == 2
        myReport.sumColumns[0] == "columnOne"
        myReport.sumColumns[1] == "columnTwo"
    }
}
