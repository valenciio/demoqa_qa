rootProject.name = "demoqa_qa"
include("src:main:test2")
findProject(":src:main:test2")?.name = "test2"
