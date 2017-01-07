import np.com.grailslogin.User
import np.com.grailslogin.Role
import np.com.grailslogin.UserRole

class BootStrap {

    def init = { servletContext ->
        User user = new User(username: 'user', password: 'password').save()
        Role role = new Role(authority: 'USER_ROLE').save()
        new UserRole(user, role).save()
    }
    def destroy = {
    }
}
