import org.scalatest.{DiagrammedAssertions, FlatSpec, FunSuite}

/**
  * Created by Shindo on 2016/12/22.
  */
class Test extends FlatSpec with DiagrammedAssertions {

  val userService = new UserService with UseMockUserRepository

  "doSomething" should "return 'this is mock'" in {
    assert(userService.doSomething == "this is mock")
  }
}

object UserRepositoryMock extends UserRepository {
  override def say(): String = "this is mock"
}

trait UseMockUserRepository extends UsesUserRepository {
  override val userRepository = UserRepositoryMock
}
