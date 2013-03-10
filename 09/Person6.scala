class Person(aName: String) {
  val name: String = aName
  var zip: String = ""
  var prefecture: String = ""
  private var cityName: String = ""

  def city: String = {
    cityName
  }

  def city_=(aCityName: String) {
    cityName = aCityName
  }

  def address: String = {
    zip + " " + prefecture + " " + city
  }
}
