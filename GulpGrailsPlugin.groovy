class GulpGrailsPlugin {
    // the plugin version
    def version = "0.1.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Grails Gulp Plugin" // Headline display name of the plugin
    def author = "Jaakko Santala"
    def authorEmail = "jaakko@hypermurea.com"
    def description = '''\
	Use gulp build scripts as part of your grails project. You can call gulp tasks from grails commmand-line and link tasks to grails project
	compile and test phases.
	'''

    // URL to the plugin's documentation
    def documentation = "http://github.com/hypermurea/gulp-grails-plugin"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE'Q, 'GPL2', 'GPL3'
	def license = "APACHE"

    // Details of company behind the plugin (if there is one)
	def organization = [ name: "Hypermurea", url: "http://hypermurea.com/" ]

    // Location of the plugin's issue tracker.
	def issueManagement = [ system: "GITHUB", url: "https://github.com/hypermurea/grails-gulp-plugin/issues" ]

	// TODO link to github
    // Online location of the plugin's browseable source code.
	def scm = [ url: "https://github.com/hypermurea/grails-gulp-plugin" ]

	def scopes = [ excludes: 'war' ] 

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
