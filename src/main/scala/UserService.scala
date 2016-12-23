/**
  * Created by Shindo on 2016/12/22.
  */
abstract class UserService extends UsesUserRepository {
  def doSomething = userRepository.say()
}

object UserService extends UserService with MixInUserRepository {

}
