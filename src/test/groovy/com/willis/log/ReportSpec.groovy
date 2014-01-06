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

    def "Adding a column to avgColumns array"(){
        setup:
        def myReport = new Report("myReportName")

        when:
        myReport.avg("columnOne")
        myReport.avg("columnTwo")

        then:
        myReport.avgColumns.size() == 2
        myReport.avgColumns[0] == "columnOne"
        myReport.avgColumns[1] == "columnTwo"
    }

    def "Adding a column to groupByColumns array"(){
        setup:
        def myReport = new Report("myReportName")

        when:
        myReport.groupBy("columnOne")
        myReport.groupBy("columnTwo")

        then:
        myReport.groupByColumns.size() == 2
        myReport.groupByColumns[0] == "columnOne"
        myReport.groupByColumns[1] == "columnTwo"
    }
}
