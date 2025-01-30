package com.sitefinder.wellsitenavigatorusa.buildsrc.plugins

import com.android.build.gradle.BaseExtension
import com.sitefinder.wellsitenavigatorusa.buildsrc.Config
import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        val androidExtension = project.extensions.getByName("android") as BaseExtension

        androidExtension.apply {
            defaultConfig {
                versionCode = Config.VERSION_CODE
                versionName = Config.VERSION_NAME
            }
        }
    }
}
