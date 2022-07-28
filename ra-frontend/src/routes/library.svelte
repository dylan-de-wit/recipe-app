<script>
    import Button from '../lib/Button.svelte'
    import InputField from '../lib/form/InputField.svelte'
    import CheckBox from '../lib/form/Checkbox.svelte'
    import Divider from '../lib/Divider.svelte'
    import Icon from '../lib/Icon.svelte'
    import Search from '../lib/Search.svelte'
    import Tabs from '../lib/tab/Tabs.svelte'
    import Tab from '../lib/tab/Tab.svelte'
    import Card from '../lib/card/Card.svelte'
    import CardHeader from '../lib/card/CardHeader.svelte'
    import CardContent from '../lib/card/CardContent.svelte'
    import CardActions from '../lib/card/CardActions.svelte'
    // import AppHeader from '../lib/AppHeader.svelte'
    import AppFooter from '../lib/AppFooter.svelte'
    import Banner from '../lib/Banner.svelte'
    import Select from '../lib/form/Select.svelte'
    import Radio from '../lib/form/Radio.svelte'
    import Menu from '../lib/Menu.svelte'
    import Chips from '../lib/Chips.svelte'
    import DatePicker from '../lib/form/DatePicker.svelte'
    import Dialog from '../lib/Dialog.svelte'
    import Snackbar from '../lib/Snackbar.svelte'
    import Paginator from '../lib/Paginator.svelte'
    import Spinner from '../lib/Spinner.svelte'
    import LanguageSelector from '../lib/LanguageSelector.svelte'
    import LightDarkModeSwitcher from '../lib/LightDarkModeSwitcher.svelte'
    import Header from '../lib/Header.svelte'
    import SubHeader from '../lib/SubHeader.svelte'
</script>

<section class="page library">
    <h1>Welcome to the library</h1>
    <p>This is a complete guide on all components</p>
    <InputField></InputField>
    <CheckBox></CheckBox>
    <Button text="Dit is een knop"></Button>
    <Divider></Divider>
    <Icon></Icon>
    <Search></Search>
    <Tabs></Tabs>
    <Tab></Tab>
    <Card></Card>
    <CardHeader></CardHeader>
    <CardContent></CardContent>
    <CardActions></CardActions>
<!--    <AppHeader></AppHeader>-->
    <AppFooter></AppFooter>
    <Banner></Banner>
    <Select></Select>
    <Radio></Radio>
    <Menu></Menu>
    <Chips></Chips>
    <DatePicker></DatePicker>
    <Dialog></Dialog>
    <Snackbar></Snackbar>
    <Paginator></Paginator>
    <Spinner></Spinner>
    <LanguageSelector></LanguageSelector>
    <LightDarkModeSwitcher></LightDarkModeSwitcher>
    <Header></Header>
    <SubHeader></SubHeader>
</section>

<style lang="scss">
  @import "../styles/theme";

  .library {
    display: flex;
    flex-direction: column;
    gap: .25rem;
  }

</style>