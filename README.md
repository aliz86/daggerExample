
---------------------------------------------------------
if module needs a parameter:
val appComponent = DaggerApplicationComponent//.create()
.builder()
.myFirstDiModule(MyFirstDiModule(100))
.build()

if it doesn't:
val appComponent2 = DaggerApplicationComponent.create()

---------------------------------------------------------



