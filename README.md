
For Dagger and ViewModel, please refer to the project "dagger viewmodel" : 
https://github.com/aliz86/daggerviewmodel
Note that for Viewmodels, it is recommended to use Hilt. Because it is much easier.
---------------------------------------------------------
if module needs a parameter:
val appComponent = DaggerApplicationComponent//.create()
.builder()
.myFirstDiModule(MyFirstDiModule(100))
.build()

if it doesn't:
val appComponent2 = DaggerApplicationComponent.create()

---------------------------------------------------------
Dagger Scope:
A scoped object will share the lifecycle of the component of the same scope.
So If we have a component named "ApplicationComponent" and then a subcomponent named "ActivityComponent" (They are just names, no standard class with these names exist) with scope "ActivityScope". If we start and start thais subcomponent in a ClassB class (e.g., Activity Class), when that class instance is Garbage Collected, or if that subcomponent is set to null, the objects with the same scope will be null, too. It is like creating Singletons with scopes, being bound to certain classes.

