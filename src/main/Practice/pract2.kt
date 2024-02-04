package main.Practice



open class Mobile(var mobileType:String, var mobileName:String, var osType:String)
{

    constructor():this("Basic","Nokia220","Android")

    init {
        println("Basic Mobile")
    }

    fun sendSms(sms:String)
    {
        println("Sending sms $sms....")
    }

    fun call(mobNo:Long)
    {
        println("Calling on $mobNo....")
    }


}

class SmartPhone(mobileType: String,mobileName: String,osType: String):Mobile(mobileType,mobileName,osType){

    init {
        println("Smartphone")
    }
    fun sendWhatsAppChat(msg:String, to: Long)
    {
        println("Sending msg chat...$msg to $to")
    }

    fun browse(endpoints:String)
    {
        println("Search $endpoints on google...")
    }
    fun takePicture()
    {
        println("Taking picture..")
    }

    fun videoRecording()
    {
        println("Video recording started...")
    }
}
fun main() {

    var motorola:SmartPhone = SmartPhone("SmartPhone","MotoG60","Android")

    with(motorola)
    {
        sendSms("Hello")
        call(9693494500)
        takePicture()
        videoRecording()
        browse("Largest Bridge")
        sendWhatsAppChat("Namste",8252800394)
    }



}