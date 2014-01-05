import com.willis.log.LogReportDslEngine

/**
 * Created by Sion on 04/01/14.
 */

def engine = new LogReportDslEngine()

engine.process{

    format '^execution of (\\w+) took (\\d+)ms$'

    column 1, 'methodName'
    column 2, 'duration'

    source('performanceData2012'){
        localFile '../../../log1.log'
        localFile '../../../log2.log'

    }
    source('performanceData2013'){
        localFile '../../../log3.log'
        localFile '../../../log4.log'
    }
    report('Duration'){
        avg 'duration'
        sum 'duration'
        groupBy 'methodName'
    }
}