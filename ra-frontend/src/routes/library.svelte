<script>
    import Button from '../lib/button.svelte'
    import InputField from '../lib/form/input-field.svelte'
    import CheckBox from '../lib/form/checkbox.svelte'
    import Divider from '../lib/divider.svelte'
    import Icon from '../lib/icon.svelte'
    import Search from '../lib/search.svelte'
    import Tabs from '../lib/tab/tabs.svelte'
    import Tab from '../lib/tab/tab.svelte'
    import Card from '../lib/card/card.svelte'
    import CardHeader from '../lib/card/card-header.svelte'
    import CardContent from '../lib/card/card-content.svelte'
    import CardActions from '../lib/card/card-actions.svelte'
    import AppHeader from '../lib/app-header.svelte'
    import AppFooter from '../lib/app-footer.svelte'
    import Banner from '../lib/banner.svelte'
    import Select from '../lib/form/select.svelte'
    import Radio from '../lib/form/radio.svelte'
    import Menu from '../lib/menu.svelte'
    import Chips from '../lib/chips.svelte'
    import DatePicker from '../lib/form/date-picker.svelte'
    import Dialog from '../lib/dialog.svelte'
    import Snackbar from '../lib/snackbar.svelte'
    import Paginator from '../lib/paginator.svelte'
    import Spinner from '../lib/spinner.svelte'
    import LanguageSelector from '../lib/language-selector.svelte'
    import LightDarkModeSwitcher from '../lib/light-dark-mode-switcher.svelte'
    import Header from '../lib/header.svelte'
    import SubHeader from '../lib/sub-header.svelte'
</script>

<section class="library">
    <h1>Welcome to the library</h1>
    <p>This is a complete guide on all components</p>
    <InputField></InputField>
    <CheckBox></CheckBox>
    <Button></Button>
    <Divider></Divider>
    <Icon></Icon>
    <Search></Search>
    <Tabs></Tabs>
    <Tab></Tab>
    <Card></Card>
    <CardHeader></CardHeader>
    <CardContent></CardContent>
    <CardActions></CardActions>
    <AppHeader></AppHeader>
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
  @import "./src/styles/variables.scss";

  .library {
    display: flex;
    flex-direction: column;
    gap: .25rem;
  }

</style>