package com.willis.log

/**
 * Created by Sion on 04/01/14.
 */
class Configuration {

    def format

    private final columnNames = [:]
    private final columnIndexes = [:]
    private final sources = [:]
    private final reports = [:]

    private static int sourceCounter = 0
    private static int reportCounter = 0

    void format (String format){
        this.format = format
    }

    void column (int group, String name){
        columnNames[group] = name
        columnIndexes[name] = group
    }

    void source (Closure cl){
        def generatedName = "source${sourceCounter++}"
        source (generatedName, cl)
    }

    void source (String name, Closure cl){
        Source source = new Source(name)
        cl.delegate = source
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl()
        sources[name] = source
    }

    void report (Closure cl){
        def generatedName = "report${reportCounter++}"
        report (generatedName, cl)
    }

    void report (String name, Closure cl){
        Report report = new Report(name)
        cl.delegate = report
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl()
        reports[name] = report
    }
}
