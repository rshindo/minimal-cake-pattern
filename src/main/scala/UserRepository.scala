/**
  * Created by Shindo on 2016/12/22.
  */


trait UsesUserRepository {
  def userRepository: UserRepository
}

trait UserRepository {
  def say(): String
}

trait MixInUserRepository extends UsesUserRepository {
  def userRepository = UserRepositoryImpl
}

object UserRepositoryImpl extends UserRepository {
  def say() = "this is impl"
}