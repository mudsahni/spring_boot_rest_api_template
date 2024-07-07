package {{ cookiecutter.group_domain_type }}.{{ cookiecutter.group_name }}.{{ cookiecutter.artifact_id_slug }}

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
