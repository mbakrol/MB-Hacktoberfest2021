enum GStoryboard : String {
    case Main,
         Home,    
    var instance : UIStoryboard {
        return UIStoryboard(name: self.rawValue, bundle: Bundle.main)
    }
    
}
extension UIViewController {

    class func instantiate<T>(from storyboard: GStoryboard) -> T where T : UIViewController {
        let storyboard = UIStoryboard(name: storyboard.rawValue, bundle: nil)
        let identifier = String(describing: self)
        return storyboard.instantiateViewController(withIdentifier: identifier) as! T
    }

}
