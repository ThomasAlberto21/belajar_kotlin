fun main() {
    val openHours = 7
    val now = 5
    val office: String

    if (now > openHours) {
        office = "Office already open"
    } else if (now == openHours) {
        office = "Wait a minute, office will be open"
    } else {
        office = "Office is closed"
    }

    print(office)
}