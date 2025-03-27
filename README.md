# Mod startup
1. Open the terminal and navigate to repository of this mod
2. Run `\.gradlew` or `.\gradlew.bat` to build the mod
3. if do not work, check `gradle.propereties`
4. look for `org.gradle.jvmargs=-Xmx1G`
5. and change number between Xms and g `Xmx1G`
6. if do not work, check `build.gradle`
7. look for `classpath 'net.minecraftforge.gradle:ForgeGradle:6.+'`
8. and change the version of forge
9. still do not work, check for `repositories` in `build.gradle`
10. find `maven { url = 'https://files.minecraftforge.net/maven' }`
11. and change the url
12. after all of previos stages still do not work, download the project as zip and try 1th step
