import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class PrintTask : DefaultTask() {
    @TaskAction
    fun doAction() {
        println("Print Task")
    }
}

task("print", PrintTask::class)
