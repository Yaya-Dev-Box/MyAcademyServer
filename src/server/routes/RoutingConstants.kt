package server.routes

object RoutingConstants {

    //TODO: Create sealed class with parameters?

    const val ROOT_ROUTE = "/bazgalonia"
    const val USERS_ROUTE = "/users"
    const val PRIVATE_USERS_ROUTE = "/privateUsers"
    const val LOGIN_ROUTE = "/login"
    const val STUDENTS_ROUTE = "/students"
    const val TEACHERS_ROUTE = "/teachers"
    const val HISTORY_ROUTE = "/history"

    const val ID_PARAM_ROUTE = "/{id}"
    const val ID_PARAM_NAME = "id"
}